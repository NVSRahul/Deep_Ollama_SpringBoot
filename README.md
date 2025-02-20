# Spring Boot API for Local AI Model Integration with Ollama: DeepSeek and Beyond
This Spring Boot project enables running DeepSeek locally using Ollama, providing a seamless API to interact with the model. It leverages Ollama's flexibility to deploy and manage AI models, making it easy to integrate DeepSeek or other Ollama-supported models. The API allows for smooth communication, enabling tasks like text generation, analysis, and more. Designed for extensibility, the project can be adapted to work with any AI model available in Ollama.

Im this project HTML is frontend and java is backend

## 1. Install ollama
Download from here https://ollama.com/

## 2. Install required model from the webiste
Download models from https://ollama.com/search

## 3. Initialize Spring Framework
Verify my Repositorie ABOVE and 
to initialize Spring use https://start.spring.io/

## 4. Finally Run and test the Model

## To install Ollama in any linux base servers or Codespace
Implement these commands
```

curl -fsSL https://ollama.com/install.sh | sh

```

## To run Ollama on Codespace
First run this in one terminal
```

ollama serve

```

## To see the list of Ollamas installed
```

ollama list

```

## To install any model form Ollama 
You can see in their website or implement this
```

ollama pull "MODEL_NAME"

```
or 
```

ollama run "MODEL_NAME"

```

## To End the model running
To end the chat with model use
```

/bye

```
