package com.project.asset_Management_System.controller;

import com.project.asset_Management_System.model.AssetType;
import com.project.asset_Management_System.service.AssetTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AssetTypeController {
    @Autowired
    AssetTypeServiceImpl assetTypeServiceImpl;

    @GetMapping("/asset-types")
    public List<AssetType> getAllAssetTypes() {
        return assetTypeServiceImpl.getAllAssetTypes();
    }

    @GetMapping("/asset-types/{id}")
    public AssetType getAssetTypeById(@PathVariable int id) {
        return assetTypeServiceImpl.getAssetTypeById(id);
    }

    @PostMapping("/asset-types")
    public AssetType createAssetType(@RequestBody List<AssetType> assetType) {
        return assetTypeServiceImpl.createAssetType(assetType);
    }

    @PutMapping("/asset-types/{id}")
    public AssetType updateAssetType(@RequestBody AssetType assetType, @PathVariable int id) {
        return assetTypeServiceImpl.updateAssetType(assetType, id);
    }

    @DeleteMapping("/asset-types/{id}")
    public AssetType deleteAssetType(@PathVariable int id) {
        return assetTypeServiceImpl.deleteAssetType(id);
    }

}