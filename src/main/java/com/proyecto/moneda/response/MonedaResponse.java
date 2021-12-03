package com.proyecto.moneda.response;

public class MonedaResponse {
		private double monto;
		private double montoConTipoCambio;
		private String monedaOrigen;
		private String monedaDestino;
		private double tipoDeCambio;
		
		
		
		public MonedaResponse() {
			super();
		}
		public MonedaResponse(double monto, double montoConTipoCambio, String monedaOrigen, String monedaDestino,
				double tipoDeCambio) {
			super();
			this.monto = monto;
			this.montoConTipoCambio = montoConTipoCambio;
			this.monedaOrigen = monedaOrigen;
			this.monedaDestino = monedaDestino;
			this.tipoDeCambio = tipoDeCambio;
		}
		public double getMonto() {
			return monto;
		}
		public void setMonto(double monto) {
			this.monto = monto;
		}
		public double getMontoConTipoCambio() {
			return montoConTipoCambio;
		}
		public void setMontoConTipoCambio(double montoConTipoCambio) {
			this.montoConTipoCambio = montoConTipoCambio;
		}
		public String getMonedaOrigen() {
			return monedaOrigen;
		}
		public void setMonedaOrigen(String monedaOrigen) {
			this.monedaOrigen = monedaOrigen;
		}
		public String getMonedaDestino() {
			return monedaDestino;
		}
		public void setMonedaDestino(String monedaDestino) {
			this.monedaDestino = monedaDestino;
		}
		public double getTipoDeCambio() {
			return tipoDeCambio;
		}
		public void setTipoDeCambio(double tipoDeCambio) {
			this.tipoDeCambio = tipoDeCambio;
		}
		
		
}
