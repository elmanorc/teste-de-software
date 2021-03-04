package sistemaLeilao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Leilao {

	private String descricao;
	private List<Lance> lances;
	private Calendar data;
	
	public Leilao(String descricao) {
		super();
		this.descricao = descricao;
		this.lances = new ArrayList<Lance>();
		this.data = Calendar.getInstance(new Locale("pt", "BR"));
	}
	
	public void propoe(Lance lance) {
		
		if(lances.isEmpty() ||
				!lances.get(lances.size()-1)
				.getUsuario().equals(lance.getUsuario())) {
		
			lances.add(lance);
		}
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<Lance> getLances() {
		return Collections.unmodifiableList(lances);
	}
	public void setLances(List<Lance> lances) {
		this.lances = lances;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public void encerra() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
