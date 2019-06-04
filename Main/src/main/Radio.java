/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author camila
 */
public interface Radio {
    
    public void setEmissora(float emissora, String tipoEmi);
    public float getEmissora();
    public String getTipoEmissora();
    public void setVolumeRadio(int volume);
    public int getVolumeRadio();
    }
