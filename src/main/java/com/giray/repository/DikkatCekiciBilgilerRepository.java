package com.giray.repository;

import com.giray.entity.DikkatCekiciBilgiler;

public class DikkatCekiciBilgilerRepository extends RepositoryManager<DikkatCekiciBilgiler,Long>{
    public DikkatCekiciBilgilerRepository() {
        super(new DikkatCekiciBilgiler());
    }
}
