public class Jogador extends Personagem {
    
    private int acrobacia;
    private int arcanismo;
    private int atletismo;
    private int enganação;
    private int furtividade;
    private int intimidação;
    private int intuição;
    private int investigação;
    private int medicina;
    private int percepção;
    private int persuasão;
    private int religião;
    
    public Jogador(String nome, String lore, String raça, int idade, int força, int destreza, int agilidade,
            int inteligencia, int carisma, int acrobacia, int arcanismo, int atletismo, int enganação, int furtividade,
            int intimidação, int intuição, int investigação, int medicina, int percepção, int persuasão, int religião) {
        super(nome, lore, raça, idade, força, destreza, agilidade, inteligencia, carisma);
        this.acrobacia = acrobacia;
        this.arcanismo = arcanismo;
        this.atletismo = atletismo;
        this.enganação = enganação;
        this.furtividade = furtividade;
        this.intimidação = intimidação;
        this.intuição = intuição;
        this.investigação = investigação;
        this.medicina = medicina;
        this.percepção = percepção;
        this.persuasão = persuasão;
        this.religião = religião;
    }

    public int getAcrobacia() {
        return acrobacia;
    }

    public void setAcrobacia(int acrobacia) {
        this.acrobacia = acrobacia;
    }

    public int getArcanismo() {
        return arcanismo;
    }

    public void setArcanismo(int arcanismo) {
        this.arcanismo = arcanismo;
    }

    public int getAtletismo() {
        return atletismo;
    }

    public void setAtletismo(int atletismo) {
        this.atletismo = atletismo;
    }

    public int getEnganação() {
        return enganação;
    }

    public void setEnganação(int enganação) {
        this.enganação = enganação;
    }

    public int getFurtividade() {
        return furtividade;
    }

    public void setFurtividade(int furtividade) {
        this.furtividade = furtividade;
    }

    public int getIntimidação() {
        return intimidação;
    }

    public void setIntimidação(int intimidação) {
        this.intimidação = intimidação;
    }

    public int getIntuição() {
        return intuição;
    }

    public void setIntuição(int intuição) {
        this.intuição = intuição;
    }

    public int getInvestigação() {
        return investigação;
    }

    public void setInvestigação(int investigação) {
        this.investigação = investigação;
    }

    public int getMedicina() {
        return medicina;
    }

    public void setMedicina(int medicina) {
        this.medicina = medicina;
    }

    public int getPercepção() {
        return percepção;
    }

    public void setPercepção(int percepção) {
        this.percepção = percepção;
    }

    public int getPersuasão() {
        return persuasão;
    }

    public void setPersuasão(int persuasão) {
        this.persuasão = persuasão;
    }

    public int getReligião() {
        return religião;
    }

    public void setReligião(int religião) {
        this.religião = religião;
    }
   
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\n" + "Acrobacia: " + acrobacia + "Arcanismo: " + arcanismo + "\n" + "Atletismo: " + atletismo +
               "\n" + "Enganação" + enganação + "\n" + "Furtividade; " + furtividade + "\n" + "Intimidação" + intimidação + "\n" +
               "Intuição: " + intuição + "\n" + "Investigação" + investigação + "\n" + "Medicina: " + medicina + "\n" + 
               "Percepção: " + percepção + "\n" + "Persuação: " + persuasão + "\n" + "Religião: " + religião + "\n" +
               "-------------------------------------";

    }


}
