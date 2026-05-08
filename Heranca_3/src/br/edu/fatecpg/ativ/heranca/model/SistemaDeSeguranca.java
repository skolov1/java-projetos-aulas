package br.edu.fatecpg.ativ.heranca.model;

public class SistemaDeSeguranca implements Autenticavel {
    private final String usuarioCorreto = "admin";
    private final String senhaCorreta = "1234";
    
    private boolean autenticado = false;

    @Override
    public boolean login(String usuario, String senha) {
        if (this.usuarioCorreto.equals(usuario) && this.senhaCorreta.equals(senha)) {
            this.autenticado = true;
            return true;
        }
        
        return false;
    }

    @Override
    public void logout() {
        this.autenticado = false;
        System.out.println("Logout realizado com sucesso. sessão encerrada, até mais... ou não");
    }

    public boolean isAutenticado() {
        return autenticado;
    }
}