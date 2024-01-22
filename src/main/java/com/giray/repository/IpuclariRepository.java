package com.giray.repository;

import com.giray.entity.Ipuclari;

public class IpuclariRepository extends RepositoryManager<Ipuclari,Long>{
    public IpuclariRepository() {
        super(new Ipuclari());
    }
}
