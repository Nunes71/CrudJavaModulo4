package br.com.goviagens.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.goviagens.factory.ConnectionFactoryGoViagens;
import br.com.goviagens.model.Promocao;

public class promocaodao {
	public void save (Promocao promocao) {

		String sql = "INSERT INTO Promocao(Nome, Valor, DestinosID)" + "VALUES(?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			
			conn = ConnectionFactoryGoViagens.createConnectionSQLServer();
			
			pstm = conn.prepareStatement(sql);
			
			pstm.setString (1 , promocao.getNome());
			pstm.setInt (2 , promocao.getValor());
			pstm.setInt (3 , promocao.getDestinosID());
			pstm.execute();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null ) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}

	public void removeById(int id) {
		String sql = "DELETE FROM contatos WHERE id = ?";
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			
			conn = ConnectionFactoryGoViagens.createConnectionSQLServer();
			pstm = conn.prepareStatement(sql);
			pstm.setInt (1, id);
			pstm.execute();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}

	public void update ( Promocao promocao) {
		
		String sql= " UPDATE contato SET nome = ?, email=?, telefone=?" + "Where id=? ";
		
		Connection conn = null;
		PreparedStatement pstm = null;
	try {
			
			conn = ConnectionFactoryGoViagens.createConnectionSQLServer();
			
			pstm = conn.prepareStatement(sql);
			
			pstm.setString (1 , promocao.getNome());
			pstm.setInt (2 , promocao.getValor());
			pstm.setInt (2 , promocao.getDestinosID());
			
			
			
			pstm.execute();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null ) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public List<Promocao> getPromocao() {
		
		String sql="SELECT * from contato";
		
		List<Promocao> contato = new ArrayList<Promocao>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		
			try {
			
			conn = ConnectionFactoryGoViagens.createConnectionSQLServer();
			pstm = conn.prepareStatement(sql);
			rset= pstm.executeQuery();
			
			while (rset.next()){
				
				Promocao promocaos= new Promocao();
				
				promocaos.setId(rset.getInt("id"));
				promocaos.setNome(rset.getString("Nome"));
				promocaos.setValor(rset.getInt("Valor"));
				promocaos.setDestinoID(rset.getInt("DestinosID"));
				
				promocao.add(promocaos);
				
				
			}
		

			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null ) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			return promocao;
	}
}
