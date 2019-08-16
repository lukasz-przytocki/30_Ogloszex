package pl.javastart.restoffers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Controller
public class OfferController {

    public OfferRepository offerRepository;
    public CategoryRepository categoryRepository;

    public OfferController(OfferRepository offerRepository, CategoryRepository categoryRepository) {
        this.offerRepository = offerRepository;
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/")
    public List<Offer> displayAll() {
        List<Offer> offerList = offerRepository.findAll();
        return offerList;
    }
}
