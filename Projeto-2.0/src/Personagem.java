public class Personagem {

    private String nome;
    private String lore;
    private String raça;
    private int idade;
    private int força;
    private int destreza;
    private int agilidade;
    private int inteligencia;
    private int carisma;
   
   
    public Personagem(String nome, String lore, String raça, int idade, int força, int destreza, int agilidade,
            int inteligencia, int carisma) {
        this.nome = nome;
        this.lore = lore;
        this.raça = raça;
        this.idade = idade;
        this.força = força;
        this.destreza = destreza;
        this.agilidade = agilidade;
        this.inteligencia = inteligencia;
        this.carisma = carisma;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getLore() {
        return lore;
    }


    public void setLore(String lore) {
        this.lore = lore;
    }


    public String getRaça() {
        return raça;
    }


    public void setRaça(String raça) {
        this.raça = raça;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public int getForça() {
        return força;
    }


    public void setForça(int força) {
        this.força = força;
    }


    public int getDestreza() {
        return destreza;
    }


    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }


    public int getAgilidade() {
        return agilidade;
    }


    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }


    public int getInteligencia() {
        return inteligencia;
    }


    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }


    public int getCarisma() {
        return carisma;
    }


    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\n" + "Nome: " + nome + "\n" + "Lore: " + lore + "\n" + "Raça: " + raça + "\n" +
                "Idade: " + idade + "\n" + "Força: " + força + "\n" + "Destreza: " + "\n" +
                "Agilidade" + agilidade + "\n" + "Inteligência: " + inteligencia + "\n" + 
                "Carisma" + carisma + "\n" + "-------------------------------------";
    }

}