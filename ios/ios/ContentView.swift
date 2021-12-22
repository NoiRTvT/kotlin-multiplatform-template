import SwiftUI
import shared

struct ContentView: View {
    @State var counter: Counter = Counter(count: 0)
    
	var body: some View {
        VStack {
            Button(action: {counter = Counter(count: counter.count - 1 )}) {
                Text("-")
                                .font(.headline)
                                .foregroundColor(.white)
                                .padding()
                                .frame(width: 220, height: 60)
                                .background(Color.green)
                                .cornerRadius(15.0)
                        }
            Text("\(counter.count)")
                            .font(.headline)
                            .foregroundColor(.white)
                            .padding()
                            .frame(width: 220, height: 60)
                            .background(Color.green)
                            .cornerRadius(15.0)
            Button(action: {counter = Counter(count: counter.count + 1 )}) {
                Text("+")
                                .font(.headline)
                                .foregroundColor(.white)
                                .padding()
                                .frame(width: 220, height: 60)
                                .background(Color.green)
                                .cornerRadius(15.0)
                        }
        }
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
