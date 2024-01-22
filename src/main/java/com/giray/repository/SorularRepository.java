package com.giray.repository;

import com.giray.entity.Sorular;

public class SorularRepository extends RepositoryManager<Sorular,Long>{
    public SorularRepository() {
        super(new Sorular());
    }
}
