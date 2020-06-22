package apcsa.objects;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import apcsa.Config;
import apcsa.Handler;
import apcsa.graphics.Animation;
import apcsa.graphics.Assets;
import apcsa.objects.bats.Bat;
import apcsa.states.State;

public class Player extends Entity {
    private double xMove;
    private double yMove;
    private double speed;
    private int health;
    private Animation attackLeft;
    private Animation attackLeftDown;
    private Animation attackLeftUp;
    private Animation attackRight;
    private Animation attackRightDown;
    private Animation attackRightUp;
    private Animation idleLeft;
    private Animation idleRight;
    private Animation runLeft;
    private Animation runRight;
    private boolean lookingLeft;

    public Player(int x, int y) {
        super(x, y);
        this.speed = Config.DEFAULT_PLAYER_SPEED;
        this.health = Config.DEFAULT_PLAYER_HEALTH;
        this.lookingLeft = false;
        initAnimations();
    }

    private void inputMove() {
        xMove = 0;
        yMove = 0;

        if(Handler.getKeyInput().keyW()) {
            yMove -= speed;
        }
        if(Handler.getKeyInput().keyA()) {
            xMove -= speed;
            lookingLeft = true;
        }
        if(Handler.getKeyInput().keyS()) {
            yMove += speed;
        }
        if(Handler.getKeyInput().keyD()) {
            xMove += speed;
            lookingLeft = false;
        }

        if((x + xMove) <= Config.TILE_WIDTH) {
            xMove = 0;
            x = Config.TILE_WIDTH;
        }
        if((x + xMove + Config.DEFAULT_PLAYER_WIDTH) >= Config.WIDTH - (2.5 * Config.TILE_WIDTH)) {
            xMove = 0;
            x = Config.WIDTH - (2.5 * Config.TILE_WIDTH) - Config.DEFAULT_PLAYER_WIDTH;
        }
        if((y + yMove) <= Config.TILE_HEIGHT) {
            yMove = 0;
            y = Config.TILE_HEIGHT;
        }
        if((y + yMove + Config.DEFAULT_PLAYER_HEIGHT) >= Config.HEIGHT - (3 * Config.TILE_HEIGHT)){
            yMove = 0;
            y = Config.HEIGHT - (3 * Config.TILE_HEIGHT) - Config.DEFAULT_PLAYER_HEIGHT;
        }
    }

    public void move() {
        x += xMove;
        y += yMove;
    }

    public void inputAttack() {
        if(Handler.getKeyInput().keyI()) {
            attackChecker(new Rectangle((int) x, (int) (y - Config.ATTACK_SIZE), Config.DEFAULT_PLAYER_WIDTH, Config.ATTACK_SIZE));
        }
        else if(Handler.getKeyInput().keyJ()) {
            attackChecker(new Rectangle((int) (x - Config.ATTACK_SIZE), (int) y, Config.ATTACK_SIZE, Config.DEFAULT_PLAYER_HEIGHT));
        }
        else if(Handler.getKeyInput().keyK()) {
            attackChecker(new Rectangle((int) x, (int) (y + Config.DEFAULT_PLAYER_HEIGHT), Config.DEFAULT_PLAYER_WIDTH, Config.ATTACK_SIZE));
        }
        else if(Handler.getKeyInput().keyL()) {
            attackChecker(new Rectangle((int) x + Config.DEFAULT_PLAYER_WIDTH, (int) y, Config.ATTACK_SIZE, Config.DEFAULT_PLAYER_HEIGHT));
        }
    }

    public void attackChecker(Rectangle attack) {
        for(int i = 0; i < Handler.getSpawner().getBats().size(); i++) {
            Bat tempBat = Handler.getSpawner().getBats().get(i);
            if(attack.intersects(tempBat.getBounds())) {
                tempBat.hurt();
            }
        }
    }

    public Rectangle getBounds() {
        return new Rectangle((int) x + 30, (int) y + 30, Config.DEFAULT_PLAYER_WIDTH - 30, Config.DEFAULT_PLAYER_HEIGHT - 30);
    }

    public void batCollision() {
        for(int i = 0; i < Handler.getSpawner().getBats().size(); i++) {
            Bat tempBat = Handler.getSpawner().getBats().get(i);
            if(getBounds().intersects(tempBat.getBounds())) {
                health -= 2;
            }
        }
    }

    public void checkDeath() {
        if(health <= 0) {
            State.setState(Handler.getOverState());
        } 
    }

    public void renderHealth(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(47, Config.HEIGHT - 52, health, 8);
        g.drawImage(Assets.getHealthBar(), 10, Config.HEIGHT - 68, 160, 40, null);
    }

    public void heal() {
        health += 10;
    }

    private void initAnimations() {
        attackLeft = new Animation(75, Assets.getPlayerAttackLeft());
        attackLeftDown = new Animation(75, Assets.getPlayerAttackLeftDown());
        attackLeftUp = new Animation(75, Assets.getPlayerAttackLeftUp());
        attackRight = new Animation(75, Assets.getPlayerAttackRight());
        attackRightDown = new Animation(75, Assets.getPlayerAttackRightDown());
        attackRightUp = new Animation(75, Assets.getPlayerAttackRightUp());
        idleLeft = new Animation(100, Assets.getPlayerIdleLeft());
        idleRight = new Animation(100, Assets.getPlayerIdleRight());
        runLeft = new Animation(100, Assets.getPlayerRunLeft());
        runRight = new Animation(100, Assets.getPlayerRunRight());
    }

    private void tickAnimations() {
        attackLeft.tick();
        attackLeftDown.tick();
        attackLeftUp.tick();
        attackRight.tick();
        attackRightDown.tick();
        attackRightUp.tick();
        idleLeft.tick();
        idleRight.tick();
        runLeft.tick();
        runRight.tick();
    }

    public BufferedImage nextFrame() {
        if(Handler.getKeyInput().keyI()) {
            if(lookingLeft) {
                return attackLeftUp.getCurrentFrame();
            }
            else {
                return attackRightUp.getCurrentFrame();
            }
        }
        else if(Handler.getKeyInput().keyJ()) {
            return attackLeft.getCurrentFrame();
        }
        else if(Handler.getKeyInput().keyK()) {
            if(lookingLeft) {
                return attackLeftDown.getCurrentFrame();
            }
            else {
                return attackRightDown.getCurrentFrame();
            }
        }
        else if(Handler.getKeyInput().keyL()) {
            return attackRight.getCurrentFrame();
        }
        else if(Handler.getKeyInput().keyW() || Handler.getKeyInput().keyA() || 
        Handler.getKeyInput().keyS() || Handler.getKeyInput().keyD()) {
            if(lookingLeft) {
                return runLeft.getCurrentFrame();
            }
            else {
                return runRight.getCurrentFrame();
            }
        }
        else if(lookingLeft) {
            return idleLeft.getCurrentFrame();
        }
        else {
            return idleRight.getCurrentFrame();
        }
    }

    @Override
    public void tick() {
        inputMove();
        move();
        inputAttack();
        tickAnimations();
        batCollision();
        checkDeath();
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(nextFrame(), (int) x,(int) y, Config.DEFAULT_PLAYER_WIDTH, Config.DEFAULT_PLAYER_HEIGHT, null);
        renderHealth(g);
    }
}