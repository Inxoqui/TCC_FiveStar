package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProdutosDAO extends DataBaseDAO {
public ProdutosDAO() throws Exception{
		
	}
	
	//METODO EXCLUIR
	public void excluir(Produtos p) throws Exception{
		PreparedStatement pst;
		String sql = "DELETE FROM produtos WHERE id=?";
		pst = conn.prepareStatement(sql);
		pst.setInt(1, p.getidPro());
	}
	
	//METODO LISTAR
	public ArrayList<Produtos> listar() throws Exception{
		ArrayList<Produtos> lista = new ArrayList<Produtos>();
		PreparedStatement pst;
		ResultSet rs;
		String sql = "SELECT * FROM produtos";
		pst = conn.prepareStatement(sql);
		rs = pst.executeQuery();
		//REPETIÇÃO PARA A LISTAGEM
		while (rs.next()) {
			Produtos p = new Produtos();
			p.setidPro(rs.getInt("idPro"));
			p.setNome(rs.getString("nome"));
			p.setValor(rs.getDouble("valor"));
			
			lista.add(p);
		}
		
		return lista;
	}
	
	//METODO INSERIR
	public void inserir(Produtos p) throws Exception{
		PreparedStatement pst;
		String sql = "INSERT INTO produtos (nome,valor) VALUES(?,?)";
		pst = conn.prepareStatement(sql);
		pst.setString(1, p.getNome());
		pst.setDouble(2, p.getValor());
		pst.execute();		
	}
	
	//CARREGAR POR ID
	public Produtos carregarPorId(int idPro) throws Exception{
		PreparedStatement pst;
		ResultSet rs;
		String sql = "SELECT * FROM produtos WHERE id=?";
		pst = conn.prepareStatement(sql);
		pst.setInt(1, idPro);
		rs = pst.executeQuery(sql);
		Produtos p = new Produtos();
		
		if(rs.next()) {
			p.setidPro(rs.getInt("idSer"));
			p.setNome(rs.getString("nome"));
			p.setValor(rs.getDouble("valor"));			
		}
		return p;
	}
	
	public void alterar(Produtos p) throws Exception{
		PreparedStatement pst;
		String sql = "UPDATE produtos SET nome=?, valor=? WHERE id=?";
		pst = conn.prepareStatement(sql);
		pst.setString(1, p.getNome());
		pst.setDouble(2, p.getValor());
		pst.execute();
	}
	
}
