package com.portalVesti.model;

import com.portalVesti.model.KategorijaEntity;
import com.portalVesti.model.TagEntity;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-15T13:19:39")
@StaticMetamodel(VestEntity.class)
public class VestEntity_ { 

    public static volatile SingularAttribute<VestEntity, Date> datum;
    public static volatile ListAttribute<VestEntity, TagEntity> tagovi;
    public static volatile SingularAttribute<VestEntity, String> naslov;
    public static volatile SingularAttribute<VestEntity, String> tekst;
    public static volatile SingularAttribute<VestEntity, Integer> idVest;
    public static volatile SingularAttribute<VestEntity, KategorijaEntity> kategorija;

}