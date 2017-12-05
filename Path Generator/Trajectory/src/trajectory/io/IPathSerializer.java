package trajectory.io;

import trajectory.Path;

/**
 * Interface for methods that serialize a Path or Trajectory.

 */
public interface IPathSerializer {

  public String serialize(Path path);
}