/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tartanga.grupo4.businesslogic;

import com.tartanga.grupo4.models.CreditCard;
import java.util.List;
import javax.ws.rs.core.GenericType;

/**
 *
 * @author Iñi
 */
public interface CreditCardLogicController {
    
  public List<CreditCard> findAllCreditCards(GenericType<List<CreditCard>> responseType);
  
  public void deleteCreditCardByCardNumber(String creditCardNumber);
  
}
