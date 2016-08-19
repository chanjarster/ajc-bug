package ajcbug;

import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class DeepVmAssembleHelper {

  private DeepVmAssembleHelper() {

  }

  public static <DOMAIN extends RootEntity, DEEPVM extends RootEntity, PROPASSOC extends Association, PROPVM extends RootEntity>
  void assembleSinglePropertyVm(
      List<DOMAIN> domainList,
      List<DEEPVM> deepVmList,
      Function<DOMAIN, PROPASSOC> domainPropertyAssocGetter,
      Function<Set<PROPASSOC>, List<PROPVM>> propertyVmListGenerator,
      BiConsumer<DEEPVM, PROPVM> deepVmPropertySetter
  ) {

  }

}
