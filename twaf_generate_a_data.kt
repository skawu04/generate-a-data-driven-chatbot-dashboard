data class Intent(
    val id: Int,
    val name: String,
    val description: String,
    val phrases: List<String>,
    val responses: List<Response>
)

data class Response(
    val id: Int,
    val text: String,
    val media: String? = null
)

data class Entity(
    val id: Int,
    val name: String,
    val value: String
)

data class UserInput(
    val id: Int,
    val text: String,
    val entities: List<Entity>
)

data class ChatbotState(
    val intent: Intent? = null,
    val context: Map<String, String> = emptyMap()
)

data class ChatbotDashboard(
    val intents: List<Intent>,
    val responses: List<Response>,
    val entities: List<Entity>,
    val userInputs: List<UserInput>,
    val currentState: ChatbotState
)