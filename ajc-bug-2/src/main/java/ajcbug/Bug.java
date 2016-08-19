package ajcbug;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qianjia on 16/8/19.
 */
public class Bug {

  public class Foo implements RootEntity<Foo> {

    public BarAssoc getBarAssoc() {
      return null;
    }
  }

  public class FooVm implements RootEntity {

    public void setBar(Bar bar) {
    }

  }

  public class Bar extends BaseCode {

  }

  public class BarAssoc extends BaseCodeAssoc<Bar> {

  }

  public static void main(String[] args) {

    List<Foo> wrappers = new ArrayList<>();

    List<FooVm> deepVmWrapperList = new ArrayList<>();

    BaseCodeRepository baseCodeRepository = null;
    DeepVmAssembleHelper.assembleSinglePropertyVm(
        wrappers,
        deepVmWrapperList,
        foo -> foo.getBarAssoc(),
        propertyAssocSet -> baseCodeRepository.getByAssocs(propertyAssocSet),
        (deepVm, propertyVm) -> deepVm.setBar(propertyVm)
    );

  }
}
