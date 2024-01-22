package com.giray.repository;

import com.giray.entity.UnluKisi;

public class UnluKisiRepository extends RepositoryManager<UnluKisi,Long>{
    public UnluKisiRepository() {
        super(new UnluKisi());
    }
}
