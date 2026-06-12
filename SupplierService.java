package com.example.erp_management_System.service;

import com.example.erp_management_System.entity.Supplier;
import com.example.erp_management_System.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;
    public Supplier saveSupplier(Supplier supplier){
        return supplierRepository.save(supplier);
    }
    public List<Supplier> getAllSuppliers(){
        return supplierRepository.findAll();
    }
    public void deleteSupplier(Long id){
        supplierRepository.deleteById(id);
    }
    public long getSupplierCount(){
        return supplierRepository.count();
    }
}
