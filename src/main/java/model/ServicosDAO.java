package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ServicosDAO extends DataBaseDAO {
	public ServicosDAO() throws Exception{
		
	}
	
	//METODO EXCLUIR
	public void excluir(Servicos s) throws Exception{
		PreparedStatement pst;
		String sql = "DELETE FROM servicos WHERE id=?";
		pst = conn.prepareStatement(sql);
		pst.setInt(1, s.getidSer());
		pst.execute();
	}
	
	//METODO LISTAR
	public ArrayList<Servicos> listar() throws Exception{
		ArrayList<Servicos> lista = new ArrayList<Servicos>();
		PreparedStatement pst;
		ResultSet rs;
		String sql = "SELECT * FROM servicos";
		pst = conn.prepareStatement(sql);
		rs = pst.executeQuery();
		//REPETIÇÃO PARA A LISTAGEM
		while (rs.next()) {
			Servicos s = new Servicos();
			s.setidSer(rs.getInt("idSer"));
			s.setNome(rs.getString("nome"));
			s.setValor(rs.getDouble("valor"));
			
			lista.add(s);
		}
		
		return lista;
	}
	
	//METODO INSERIR
	public void inserir(Servicos s) throws Exception{
		PreparedStatement pst;
		String sql = "INSERT INTO servicos (nome,valor) VALUES(?,?)";
		pst = conn.prepareStatement(sql);
		pst.setString(1, s.getNome());
		pst.setDouble(2, s.getValor());
		pst.execute();		
	}
	
	//CARREGAR POR ID
	public Servicos carregarPorId(int idSer) throws Exception{
		PreparedStatement pst;
		ResultSet rs;
		String sql = "SELECT * FROM servicos WHERE id=?";
		pst = conn.prepareStatement(sql);
		pst.setInt(1, idSer);
		rs = pst.executeQuery(sql);
		Servicos s = new Servicos();
		
		if(rs.next()) {
			s.setidSer(rs.getInt("idSer"));
			s.setNome(rs.getString("nome"));
			s.setValor(rs.getDouble("valor"));			
		}
		return s;
	}
	
	public void alterar(Servicos s) throws Exception{
		PreparedStatement pst;
		String sql = "UPDATE servicos SET nome=?, valor=? WHERE id=?";
		pst = conn.prepareStatement(sql);
		pst.setString(1, s.getNome());
		pst.setDouble(2, s.getValor());
		pst.execute();
	}
	
}
