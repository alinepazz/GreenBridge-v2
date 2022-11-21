
package DTO;

/**
 *
 * @author capuan0
 */
public class UsuarioDTO {
    
    private int Id_Usuario;
    private String Email_Usuario, Senha_Usuario;

    public int getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(int Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    public String getEmail_Usuario() {
        return Email_Usuario;
    }

    public void setEmail_Usuario(String Email_Usuario) {
        this.Email_Usuario = Email_Usuario;
    }

    public String getSenha_Usuario() {
        return Senha_Usuario;
    }

    public void setSenha_Usuario(String Senha_Usuario) {
        this.Senha_Usuario = Senha_Usuario;
    }
    
}
