// The Flock (a list of Boid objects)

class Flock {
  ArrayList<Boid> boids; // An ArrayList for all the boids

  Flock() {
    boids = new ArrayList<Boid>(); // Initialize the ArrayList
  }

  void run() {
    for (Boid b : boids) {
      b.run(boids);  // Passing the entire list of boids to each boid individually
    }
  }

  void addBoid(Boid b) {
    boids.add(b);
  }
 
 
  void removeNearMouse() {
     for (int i=boids.size()-1; i>=0; i--) {
        if (PVector.dist(boids.get(i).position, new PVector(mouseX, mouseY)) <50) {
           boids.remove(boids.get(i));
        }
     }
  }
}
