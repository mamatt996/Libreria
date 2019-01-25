package model;

	public class Genere {
		private String nome;
		private int GenereId;
		private int id;


		public Genere(String nome) {
		    this.nome = nome;
		}


		public String getNome() {
		    return nome;
		}


		public void setNome(String nome) {
		    this.nome = nome;
		}


		public int getGenereId() {
		    return GenereId;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}

}
