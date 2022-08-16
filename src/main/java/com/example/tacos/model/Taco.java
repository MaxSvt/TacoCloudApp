// tag::all[]
// tag::allButValidation[]
package com.example.tacos.model;
import lombok.Data;

import java.util.List;


@Data
public class Taco {
    private String name;
    private List<String> ingredients;
}
