package controller;

import model.Pessoa;

public class Control {

	public String calcular(Pessoa p) {

		String resultado = "";

		if (p.getMusculacao() <= 30) {
			if (p.getEliptco() <= 30) {
				if (p.getCorrida() > 0) {
					resultado = "ideal(5/2)";
				} else {
					if (p.getCarb() <= 256) {
						if (p.getNatacao() > 0) {
							resultado = "baixo(3/2)";
						} else {
							if (p.getBike() <= 0) {
								resultado = "ideal(123/34)";
							} else {
								if (p.getPedal() <= 0) {
									resultado = "ideal(2)";
								} else {
									resultado = "alto(3/1)";
								}
							}
						}

					} else {
						if (p.getTenis() > 0) {
							resultado = "ideal(25/1)";
						} else {
							if (p.getVoleiAreia() > 0) {
								resultado = "ideal(2/1)";
							} else {
								if (p.getAtividade() <= 80) {
									resultado = "ideal(23/10)";
								} else {
									resultado = "alto(25/5)";
								}
							}
						}
					}
				}
			} else {
				if (p.getVoleiAreia() > 0) {
					return "ideal(2/1)";
				} else {
					if (p.getAtividade() <= 80) {
						return "ideal(50/10)";
					} else {
						return "alto(15/3)";
					}
				}
			}
		} else {
			if(p.getSono()>8) {
				if (p.getNatacao() > 0) {
					resultado = "ideal(1)";
				} else {
					if (p.getBike() <= 0) {
						resultado = "alto(8/4)";
					} else {
						if (p.getPedal() >= 1) {
							resultado = "ideal(4)";
						} else {
							resultado = "alto(15/5)";
						}
					}
				} else{
					resultado = "ideal(1)";
				}
			}else {
				if(p.getPilates()>0) {
					if (p.getCaminhada() <= 80) {
						resultado = "ideal(63/10)";
					}else {
						if (p.getPedal() <= 0) {
							resultado = "ideal(3)";
						} else {
							resultado = "baixo(2/4)";
						}
					}
				}else {
					resultado = "baixo(8/16)";
				}
			}
			
		}
		return resultado;

	}

}
