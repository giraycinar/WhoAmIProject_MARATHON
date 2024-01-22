package com.giray.repository;

import com.giray.entity.Kazanan;

public class KazananRepository extends RepositoryManager<Kazanan,Long>{
    public KazananRepository() {
        super(new Kazanan());
    }
}
