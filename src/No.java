public class No<T> {

    private T Conteudo;
    private No<T> proximoNo;

    public No(T conteudo) {
        this.proximoNo = null;
        this.Conteudo = conteudo;
    }

    public T getConteudo() {
        return Conteudo;
    }

    public void setConteudo(T conteudo) {
        Conteudo = conteudo;
    }

    public No<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "Conteudo=" + Conteudo +
                '}';
    }
}
