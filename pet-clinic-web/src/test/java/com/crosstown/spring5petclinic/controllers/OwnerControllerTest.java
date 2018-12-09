package com.crosstown.spring5petclinic.controllers;

import com.crosstown.spring5petclinic.model.Owner;
import com.crosstown.spring5petclinic.services.OwnerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasProperty;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
class OwnerControllerTest {

    @Mock
    OwnerService ownerService;

    @InjectMocks
    OwnerController ownerController;

    Set<Owner> owners;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        owners = new HashSet<>();
        owners.add(Owner.builder().id(1L).build());
        owners.add(Owner.builder().id(2L).build());

        mockMvc = MockMvcBuilders
                .standaloneSetup(ownerController)
                .build();

    }

//    @Test
//    void listOwners() throws Exception {
//
//        when(ownerService.findAll()).thenReturn(owners);
//
//        mockMvc.perform(get("/owners"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("owners/index"))
//                .andExpect(model().attribute("owners", hasSize(2)));
//    }

//    @Test
//    void listOwnersByIndex() throws Exception {
//
//        when(ownerService.findAll()).thenReturn(owners);
//
//        mockMvc.perform(get("/owners/index"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("owners/index"))
//                .andExpect(model().attribute("owners", hasSize(2)));
//    }
    @Test
    void findOwners() throws Exception{
        mockMvc.perform(get("/owners/find"))
                .andExpect(status().isOk())
                .andExpect(view().name("owners/findOwners"))
                .andExpect(model().attributeExists("owner"));
    }

    /*@Test
    void processFindFormReturnMany() throws Exception {
        Owner uno = Owner.builder().id(1l).build();
        Owner dos = Owner.builder().id(2l).build();
        Owner[] tres = {uno, dos};
        when(ownerService.findAllByLastNameLike(anyString()))
                .thenReturn(Arrays.asList(tres));

        mockMvc.perform(get("/owners"))
                 .andExpect(status().isOk())
                 .andExpect(view().name("owners/ownersList"))
                 .andExpect(model().attribute("selections", hasSize(2)));

    }

    @Test
    void processFindFormReturnOne() throws Exception {
        Owner[] cuatro = {Owner.builder().id(1L).build()};
        when(ownerService.findAllByLastNameLike(anyString()))
                .thenReturn(Arrays.asList(cuatro));

        mockMvc.perform(get("/owners"))
                .andExpect(status().is3xxRedirection())
                .andExpect(view().name("redirect:owner/1"));


    }*/

    @Test
    void displayOwner() throws Exception {

        when(ownerService.findById(anyLong())).thenReturn(Owner.builder().id(1L).build());

        mockMvc.perform(get("/owners/123"))
                .andExpect(status().isOk())
                .andExpect(view().name("owners/ownerDetails"))
                .andExpect(model().attribute("owner", hasProperty("id", is(1L))));
    }
}