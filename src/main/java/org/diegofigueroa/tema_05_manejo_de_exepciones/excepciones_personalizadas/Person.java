package org.diegofigueroa.tema_05_manejo_de_exepciones.excepciones_personalizadas;

public record Person(Integer age, String name){

   public static Person create(String name, Integer age) throws AgeValidationException{
       if (age < 18){
           throw new AgeValidationException("Debes ser mayor de edad");
       }
       return new Person(age, name);
   }

}
