import { Link } from "wouter";
import Calendar from "@/components/calendar";
import WorkoutStats from "@/components/workout-stats";
import { Button } from "@/components/ui/button";
import { PlusCircle, Dices } from "lucide-react";

export default function Home() {
  return (
    <div className="min-h-screen bg-background flex flex-col">
      <main className="flex-grow container mx-auto py-8">
        <div className="flex justify-between items-center mb-8">
          <div className="flex items-center justify-center w-full mb-4">
            <h1 className="text-6xl font-audiowide text-white flex items-center gap-3 bg-gradient-to-r from-blue-500 to-purple-500 bg-clip-text text-transparent">
              <svg width="48" height="48" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path d="M6.5 7H3C2.44772 7 2 7.44772 2 8V16C2 16.5523 2.44772 17 3 17H6.5M17.5 7H21C21.5523 7 22 7.44772 22 8V16C22 16.5523 21.5523 17 21 17H17.5M6.5 12H17.5M6.5 7V17M17.5 7V17" stroke="white" strokeWidth="2" strokeLinecap="round"/>
                <circle cx="12" cy="12" r="2" fill="white"/>
              </svg>
              FitFlow
              <span className="block text-xs mt-1 opacity-70">-By: Steven Gobran-</span>
            </h1>
          </div>
          <div className="flex gap-4">
            <Link href="/coin-flip">
              <Button variant="outline">
                <Dices className="mr-2 h-4 w-4" />
                Can't Decide?
              </Button>
            </Link>
            <Link href="/workout/new">
              <Button>
                <PlusCircle className="mr-2 h-4 w-4" />
                Add Workout
              </Button>
            </Link>
          </div>
        </div>

        <div className="grid gap-8 lg:grid-cols-[2fr,1fr]">
          <div className="bg-card rounded-lg p-6 shadow-lg">
            <Calendar />
          </div>

          <div className="bg-card rounded-lg p-6 shadow-lg">
            <h2 className="text-2xl font-semibold mb-4">Workout Stats</h2>
            <WorkoutStats />
          </div>
        </div>
      </main>

      <footer className="py-4 text-center text-sm text-muted-foreground border-t">
        <p>&copy; Steven Gobran 2025</p>
      </footer>
    </div>
  );
}
