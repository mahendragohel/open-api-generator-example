package com.example.demo.delegate;

import com.example.demo.api.PetApiDelegate;
import com.example.demo.model.ModelApiResponse;
import com.example.demo.model.Pet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

public class PetApiDelegateImpl implements PetApiDelegate {
    @Override
    public ResponseEntity<Void> addPet(Pet body) {
        return PetApiDelegate.super.addPet(body);
    }

    @Override
    public ResponseEntity<Void> deletePet(Long petId, String apiKey) {
        return PetApiDelegate.super.deletePet(petId, apiKey);
    }

    @Override
    public ResponseEntity<List<Pet>> findPetsByStatus(List<String> status) {
        List<Pet> pets = new ArrayList<>();
        Pet pet = new Pet();
        pet.setId(1l);
        pets.add(pet);
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Pet>> findPetsByTags(List<String> tags) {
        return PetApiDelegate.super.findPetsByTags(tags);
    }

    @Override
    public ResponseEntity<Pet> getPetById(Long petId) {
        return PetApiDelegate.super.getPetById(petId);
    }

    @Override
    public ResponseEntity<Void> updatePet(Pet body) {
        return PetApiDelegate.super.updatePet(body);
    }

    @Override
    public ResponseEntity<Void> updatePetWithForm(Long petId, String name, String status) {
        return PetApiDelegate.super.updatePetWithForm(petId, name, status);
    }

    @Override
    public ResponseEntity<ModelApiResponse> uploadFile(Long petId, String additionalMetadata, MultipartFile file) {
        return PetApiDelegate.super.uploadFile(petId, additionalMetadata, file);
    }
}
