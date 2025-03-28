package br.senac.sp.dao;

import br.senac.sp.model.Cliente;

import java.sql.SQLException;
import java.util.List;

public interface InterfaceDao<T> {
    public void inserir(T objeto) throws SQLException;

    public void alterar(T objeto) throws SQLException;

    public void excluir(int id) throws SQLException;

    public List<T> listar() throws SQLException;

    public void buscar(int id) throws  SQLException;
}
