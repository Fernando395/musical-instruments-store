public class Provider {
    private String name;
    private String email;
    private String contact;

    public Provider(String name, String email, String contact) {
        this.name = name;
        this.email = email;
        this.contact = contact;
    }

    public void mostrarDados() {
        System.out.println("Dados do Fornecedor");
        System.out.println("Nome:" + name);
        System.out.println("E-mail:" + email);
        System.out.println("Contato celular:" + contact);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getContact() {
        return contact;
    }
}
