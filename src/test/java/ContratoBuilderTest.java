import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContratoBuilderTest {

    @Test
    void deveRetornaCodigoExternoInvalido(){
        try{
            ContratoBuilder contratoBuilder = new ContratoBuilder();
            Contrato contrato = contratoBuilder
                    .setComprador("Adailton")
                    .setStatusContrato("Ativo")
                    .setUnidadeAtendimento("UniJF")
                    .build();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("O código externo está invalido!", e.getMessage());
        }
    }

    @Test
    void deveRetornaCompradorNaoInformado(){
        try{
            ContratoBuilder contratoBuilder = new ContratoBuilder();
            Contrato contrato = contratoBuilder
                    .setCodigoExterno(1)
                    .setComprador("")
                    .setStatusContrato("Ativo")
                    .setUnidadeAtendimento("UniJF")
                    .build();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Comprador não informado!", e.getMessage());
        }
    }

    @Test
    void deveRetornaUnidadeNaoInformada(){
        try{
            ContratoBuilder contratoBuilder = new ContratoBuilder();
            Contrato contrato = contratoBuilder
                    .setCodigoExterno(2)
                    .setComprador("Adailton")
                    .setStatusContrato("Ativo")
                    .setUnidadeAtendimento("")
                    .build();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("A Unidade de atendimento não informada!", e.getMessage());
        }
    }

    @Test
    void deveRetornaFormaDePagamentoNaoInformada(){
        try{
            ContratoBuilder contratoBuilder = new ContratoBuilder();
            Contrato contrato = contratoBuilder
                    .setCodigoExterno(3)
                    .setComprador("Adailton")
                    .setStatusContrato("Ativo")
                    .setUnidadeAtendimento("UniJF")
                    .setFormaDePagamento("")
                    .build();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Forma de pagamento não informada!", e.getMessage());
        }
    }

    @Test
    void deveRetornaFormaDePagamentoInvalida(){
        try{
            ContratoBuilder contratoBuilder = new ContratoBuilder();
            Contrato contrato = contratoBuilder
                    .setCodigoExterno(4)
                    .setComprador("Adailton")
                    .setStatusContrato("Ativo")
                    .setUnidadeAtendimento("UniJF")
                    .setFormaDePagamento("cartao")
                    .build();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Forma de pagamento invalida!", e.getMessage());
        }
    }

    @Test
    void deveRetornaContratoValido(){
            ContratoBuilder contratoBuilder = new ContratoBuilder();
            Contrato contrato = contratoBuilder
                    .setCodigoExterno(5)
                    .setComprador("Adailton")
                    .setStatusContrato("Ativo")
                    .setUnidadeAtendimento("UniJF")
                    .setFormaDePagamento("Boleto")
                    .build();
            assertNotNull(contrato);
    }
}