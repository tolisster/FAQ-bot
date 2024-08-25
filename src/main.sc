require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Să începem.

    state: Hello
        intent!: /hello
        a: Buna ziua

    state: Bye
        intent!: /bye
        a: La revedere

    state: KnowledgeBase
        intentGroup!: /KnowledgeBase
        script: $faq.pushReplies();

    state: NoMatch
        event!: noMatch
        a: Nu înțeleg. Ai spus: {{$request.query}}
