package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        OutsourcedPart k= new OutsourcedPart();
        k.setCompanyName("Microsoft");
        k.setName("Keyboard");
        k.setInv(15);
        k.setMinInv(5);
        k.setMaxInv(20);
        k.setPrice(21.0);
        k.setId(18L);

        OutsourcedPart wm= new OutsourcedPart();
        wm.setCompanyName("Logitech");
        wm.setName("Wireless Mouse");
        wm.setInv(17);
        wm.setMinInv(5);
        wm.setMaxInv(20);
        wm.setPrice(13.95);
        wm.setId(19L);

        OutsourcedPart mm= new OutsourcedPart();
        mm.setCompanyName("Philips");
        mm.setName("22\" Monitor");
        mm.setInv(5);
        mm.setMinInv(1);
        mm.setMaxInv(10);
        mm.setPrice(79.99);
        mm.setId(20L);

        OutsourcedPart r= new OutsourcedPart();
        r.setCompanyName("Corsair");
        r.setName("RAM (32GB)");
        r.setInv(5);
        r.setMinInv(1);
        r.setMaxInv(10);
        r.setPrice(81.99);
        r.setId(21L);

        OutsourcedPart hd= new OutsourcedPart();
        hd.setCompanyName("Toshiba");
        hd.setName("2TB Hard Drive");
        hd.setInv(6);
        hd.setMinInv(1);
        hd.setMaxInv(12);
        hd.setPrice(59.78);
        hd.setId(22L);

        if (outsourcedPartRepository.count() == 0) {
            outsourcedPartRepository.save(k);
            outsourcedPartRepository.save(wm);
            outsourcedPartRepository.save(mm);
            outsourcedPartRepository.save(r);
            outsourcedPartRepository.save(hd);
            OutsourcedPart thePart=null;
        }

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */
        Product GComputer = new Product("Gaming Computer", 343.99, 8);
        Product NComputer = new Product("Notebook Computer", 249.98, 10);
        Product WComputer = new Product("Work Computer", 264.99, 13);
        Product LComputer = new Product("Laptop Computer", 316.18, 15);
        Product DComputer = new Product("Desktop Computer", 288.15, 19);

        if (productRepository.count()==0){
            productRepository.save(NComputer);
            productRepository.save(GComputer);
            productRepository.save(WComputer);
            productRepository.save(LComputer);
            productRepository.save(DComputer);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
