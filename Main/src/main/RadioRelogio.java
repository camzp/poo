package main;

public class RadioRelogio implements Radio, Relogio {
    private boolean ligado = false;
    private float emissora;
    private String tipoEmissora;
    private String alarme;
    private String horario;
    private int volume;
    
    
    @Override
    public void setEmissora(float emissora, String tipoEmi){
        this.emissora = emissora;
        this.tipoEmissora = tipoEmi;
    }
    @Override
    public float getEmissora(){
        return emissora;
    }
    
    @Override
    public String getTipoEmissora(){
        return tipoEmissora;
    }
    @Override
    public void setVolumeRadio(int volume){
        this.volume = volume;
    }
    @Override
    public int getVolumeRadio(){
        return volume;
    }
    @Override 
    public void setHorario(String horario){
        this.horario = horario;
    }
    @Override
    public String getHorario(){
        return horario;
    }
    @Override
    public void setHorarioAlarme(String alarme){
        this.alarme = alarme;
    }
    @Override
    public boolean ligarAlarme(){
        return ligado = true;
    }
    
    @Override   
    public boolean desligarAlarme(){
        return ligado = false;
    }
    @Override
    public void setVolume(int volume){
        this.volume = volume;
    }
    @Override
    public int getVolume(){
        return volume;
    }
}
