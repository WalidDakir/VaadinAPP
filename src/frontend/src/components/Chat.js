import React, { useState } from 'react';
import { TextField, Button } from '@vaadin/react-components';
import axios from 'axios';

const Chat = () => {
    const [message, setMessage] = useState('');
    const [responses, setResponses] = useState([]);

    const sendMessage = async () => {
        try {
            const response = await axios.post('/api/chat/message', { message });
            setResponses([...responses, response.data]);
        } catch (error) {
            console.error('Error sending message:', error);
        }
    };

    return (
        <div>
            <TextField
                label="Your message"
                value={message}
                onChange={e => setMessage(e.target.value)}
            />
            <Button onClick={sendMessage}>Send</Button>
            <div>
                {responses.map((response, index) => (
                    <p key={index}>{response}</p>
                ))}
            </div>
        </div>
    );
};

export default Chat;
