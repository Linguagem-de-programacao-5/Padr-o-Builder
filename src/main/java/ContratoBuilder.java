public class ContratoBuilder {

    private Contrato contrato;

    public ContratoBuilder(){
        contrato = new Contrato();
    }

    public Contrato build(){

        if(contrato.getCodigoExterno()<=0){
            throw new IllegalArgumentException("O código externo está invalido!");
        }
        if(contrato.getComprador().equals("")){
            throw new IllegalArgumentException("Comprador não informado!");
        }
        if(contrato.getUnidadeAtendimento().equals("")){
            throw new IllegalArgumentException("A Unidade de atendimento não informada!");
        }

        if(contrato.getFormaDePagamento().equals("")){
            throw new IllegalArgumentException("Forma de pagamento não informada!");
        }
        if(!contrato.getFormaDePagamento().equals("Boleto") && !contrato.getFormaDePagamento().equals("Debito")){
            throw new IllegalArgumentException("Forma de pagamento invalida!");
        }
        return contrato;
    }

    public ContratoBuilder setInterno(boolean interno) {
        contrato.setInterno(interno);
        return this;
    }

    public  ContratoBuilder setPlano(String plano) {
        contrato.setPlano(plano);
        return this;
    }

    public ContratoBuilder setComprador(String comprador) {
        contrato.setComprador(comprador);
        return this;
    }

    public ContratoBuilder setCodigoVenda(String codigoVenda) {
        contrato.setCodigoVenda(codigoVenda);
        return this;
    }

    public ContratoBuilder setResponsavelPelaVenda(String responsavelPelaVenda) {
        contrato.setResponsavelPelaVenda(responsavelPelaVenda);
        return this;
    }

    public ContratoBuilder setFormaDePagamento(String formaDePagamento) {
       contrato.setFormaDePagamento(formaDePagamento);
        return this;
    }

    public ContratoBuilder setRua(String rua) {
        contrato.setRua(rua);
        return this;
    }

    public ContratoBuilder setBairro(String bairro) {
        contrato.setBairro(bairro);
        return this;
    }

    public ContratoBuilder setNumero(int numero) {
        contrato.setNumero(numero);
        return this;
    }

    public ContratoBuilder setCidade(String cidade) {
        contrato.setCidade(cidade);
        return this;
    }

    public ContratoBuilder setCep(String cep) {
        contrato.setCep(cep);
        return this;
    }

    public ContratoBuilder setEstado(String estado) {
        contrato.setEstado(estado);
        return this;
    }

    public ContratoBuilder setUnidadeAtendimento(String unidadeAtendimento) {
        contrato.setUnidadeAtendimento(unidadeAtendimento);
        return this;
    }

    public ContratoBuilder setDadosDeCobranca(String dadosDeCobranca) {
        contrato.setDadosDeCobranca(dadosDeCobranca);
        return this;
    }

    public ContratoBuilder setStatusContrato(String statusContrato) {
        contrato.setStatusContrato(statusContrato);
        return this;
    }

    public ContratoBuilder setDataVenda(String dataVenda) {
        contrato.setDataVenda(dataVenda);
        return this;
    }

    public ContratoBuilder setDataCancelamento(String dataCancelamento) {
        contrato.setDataCancelamento(dataCancelamento);
        return this;
    }

    public ContratoBuilder setCodigoExterno(int codigoExterno) {
        contrato.setCodigoExterno(codigoExterno);
        return this;
    }
}
