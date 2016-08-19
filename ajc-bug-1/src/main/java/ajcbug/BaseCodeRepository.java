package ajcbug;

import java.util.Collection;
import java.util.List;

public interface BaseCodeRepository {

  <T extends BaseCode, E extends BaseCodeAssoc<T>> List<T> getByAssocs(E[] associations);

  <T extends BaseCode, E extends BaseCodeAssoc<T>> List<T> getByAssocs(Collection<E> associations);

}
