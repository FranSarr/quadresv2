package com.exercici.quadresv2.persistence;

import com.exercici.quadresv2.domain.Picture;
import com.exercici.quadresv2.domain.Shop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

public interface HelperPictureRepository extends CrudRepository<Picture, Integer> {
        List<Picture> findAllByShop(Shop shop);

        @Transactional
        void removeByShop(Shop shop);

    }
