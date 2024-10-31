//me when gravity??? lol

/**
 * Flocking 
 * by Daniel Shiffman.  
 * 
 * An implementation of Craig Reynold's Boids program to simulate
 * the flocking behavior of birds. Each boid steers itself based on 
 * rules of avoidance, alignment, and coherence.
 * 
 * Click the mouse to add a new boid.
 */

Flock flock;

void setup() {
  size(1640, 920);
  flock = new Flock();
  // Add an initial set of boids into the system
  for (int i = 0; i < 150; i++) {
    flock.addBoid(new Boid(width/2,height/2));
  }
}

void draw() {
  background(50);
  flock.run();
  if (mousePressed) { 
    for (int i=0; i<100; i++) {
      flock.addBoid(new Boid(random(1630),random(960)));
    }
  }
}

void keyPressed() {
  flock.removeNearMouse();
}

// Add a new boid into the System
