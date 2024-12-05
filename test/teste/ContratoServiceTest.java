package teste;

import dao.ContratoDao;
import dao.IContratoDao;
import dao.mock.ContratoDaoMock;
import org.junit.Assert;
import org.junit.Test;
import service.ContratoService;
import service.IContratoService;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao mock = new ContratoDaoMock();
        IContratoService service = new ContratoService(mock);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNosalvarComBancoDeDadosTest() {
        IContratoDao mock = new ContratoDao();
        IContratoService service = new ContratoService(mock);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTeste() {
        IContratoDao mock = new ContratoDaoMock();
        IContratoService service = new ContratoService(mock);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroBuscarComBancoDeDadosTest() {
        IContratoDao mock = new ContratoDao();
        IContratoService service = new ContratoService(mock);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void excluirTest() {
        IContratoDao mock = new ContratoDaoMock();
        IContratoService service = new ContratoService(mock);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroExcluirComBancoDeDadosTest() {
        IContratoDao mock = new ContratoDao();
        IContratoService service = new ContratoService(mock);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void atualizarTeste() {
        IContratoDao mock = new ContratoDaoMock();
        IContratoService service = new ContratoService(mock);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAtualizarComBancoDeDadosTest() {
        IContratoDao mock = new ContratoDao();
        IContratoService service = new ContratoService(mock);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
