package trajectory.io;

import trajectory.Path;

/**
 * Interface for methods that deserializes a Path or Trajectory.
 * 
 * 
 */
public interface IPathDeserializer {
  
  public Path deserialize(String serialized);
}
