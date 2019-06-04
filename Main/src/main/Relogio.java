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
public interface Relogio {
    
    public void setHorario(String horario);
    public String getHorario();
    public void setHorarioAlarme(String alarme);
    public boolean ligarAlarme();
    public boolean desligarAlarme();
    public void setVolume(int volume);
    public int getVolume();
    
    
}
