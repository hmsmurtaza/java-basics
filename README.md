# Factory Pattern
## At Compile-time check: 
#### At compile-time, compiler only make sure that the Shape interface has a draw() method, so call to draw() method is correct.

# Runtime resolution:
#### At runtime, JVM looks at the actual object of the object, stored in the circleShape reference, (which is 'Circle').  

# Method Execution:
#### It then executes the draw() method, beloging to the Circle class's implementation, overriding any potential default implementation in the interface. 
