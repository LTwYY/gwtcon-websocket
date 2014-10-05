package com.google.developers.gdgfirenze.client;

import com.google.developers.gdgfirenze.client.ui.ChatView;
import com.google.developers.gdgfirenze.shared.Message;

public class ChatPresenter implements ChatView.Presenter, WebSocketHandler {

	private ChatView view;
	private WebSocket webSocket;

	public ChatPresenter(ChatView view, WebSocket webSocket) {
		super();
		this.view = view;
		this.webSocket = webSocket;
		view.setPresenter(this);
		webSocket.addWebSocketHandler(this);
	}

	@Override
	public void sendMessage(Message message) {
		webSocket.sendMessae(message);
	}

	@Override
	public void onClose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onError(String error) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onMessage(Message msg) {
		view.addMessage(msg);

	}

	@Override
	public void onOpen() {
		// TODO Auto-generated method stub

	}

}
