package com.example.open.wishlist.repository;

import com.example.open.db.MemoryDbRepositoryAbstract;
import com.example.open.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {
}
