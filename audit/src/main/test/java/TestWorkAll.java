import com.lovo.audit.entity.lh.MarketingEntity;
import com.lovo.audit.entity.lh.SpecificationEntity;
import com.lovo.audit.service.lh.IMarketingService;
import com.lovo.audit.service.lh.ISpecificationService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestWorkAll {
    @Autowired
    private IMarketingService service;
    @Autowired
    private ISpecificationService service2;

    @Test
    public void saveMarket(){
        MarketingEntity marketingEntity = new MarketingEntity();
        SpecificationEntity specificationEntity = new SpecificationEntity();
        marketingEntity.setProductCode("2123");
        marketingEntity.setProductName("程鹏鹰");
        marketingEntity.setProductType("人物");
        marketingEntity.setProductPrice(10.0);
        marketingEntity.setDiscount(0.27);
        service.saveMarket(marketingEntity);
        specificationEntity.setSpecificationName("规格一");
        specificationEntity.setProductCode(marketingEntity);
        specificationEntity.setSpecificationValue("规格一的值");
        service2.saveSpecifition(specificationEntity);
    }
}
